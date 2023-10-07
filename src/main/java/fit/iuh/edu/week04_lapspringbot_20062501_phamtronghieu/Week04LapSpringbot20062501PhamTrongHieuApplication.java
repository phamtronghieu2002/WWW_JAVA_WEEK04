package fit.iuh.edu.week04_lapspringbot_20062501_phamtronghieu;

import fit.iuh.edu.week04_lapspringbot_20062501_phamtronghieu.daos.ManufacturerDAO;
import fit.iuh.edu.week04_lapspringbot_20062501_phamtronghieu.entities.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week04LapSpringbot20062501PhamTrongHieuApplication {

    @Autowired
    private ManufacturerDAO manuDao;
    public static void main(String[] args) {
        SpringApplication.run(Week04LapSpringbot20062501PhamTrongHieuApplication.class, args);
    }

    @Bean
    CommandLineRunner test1()
    {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                manuDao.insert(new Manufacturer("Apple","apple@gmail.com"));
                System.out.println(manuDao.finById(1L));
            }

        };
    }

}
