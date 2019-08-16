package com.example.girl1;

import com.example.girl1.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA=new Girl();
        girlA.setCupSize("A");
        girlA.setAge(50);
        girlRepository.save(girlA);

        Girl girlB=new Girl();
        girlB.setCupSize("BBBB");
        girlB.setAge(31);
        girlRepository.save(girlB);
    }

}
