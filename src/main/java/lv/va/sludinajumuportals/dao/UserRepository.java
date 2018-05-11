
package lv.va.sludinajumuportals.dao;

import lv.va.sludinajumuportals.domain.Advertisement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends CrudRepository<Advertisement,Long>{
    
}
