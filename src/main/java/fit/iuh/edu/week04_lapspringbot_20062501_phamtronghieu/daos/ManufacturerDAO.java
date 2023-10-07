package fit.iuh.edu.week04_lapspringbot_20062501_phamtronghieu.daos;

import fit.iuh.edu.week04_lapspringbot_20062501_phamtronghieu.entities.Manufacturer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class ManufacturerDAO  extends AbstractDAO   <Manufacturer,Long>{


    public ManufacturerDAO(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void insert(Manufacturer entity) {
        String sql ="INSERT INTO manufacturer  VALUES (?,?,?)";
        jdbcTemplate.update(sql,entity.getId(),entity.getName(),entity.getEmail());
    }

    @Override
    public Manufacturer finById(Long aLong) {

            String sql ="select * from manufacturer where id = ?";
            return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Manufacturer.class),aLong);


    }

    @Override
    public List<Manufacturer> findAll() {
        return null;
    }
}
