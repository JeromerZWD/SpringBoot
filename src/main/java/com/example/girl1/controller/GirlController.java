package com.example.girl1.controller;

import com.example.girl1.Girl;
import com.example.girl1.repository.GirlRepository;
import com.example.girl1.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    /*
    * 查询所有女生列表
    * */
    @GetMapping("/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }
    /*
    * 添加一个女生
    * */
    @PostMapping("/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }
    /*
    * 查询一个女生
    * */
    @GetMapping("/girls/{id}")
    public Optional<Girl> girlById(@PathVariable("id") Integer id){
        return girlRepository.findById(id);
    }
    /*
    * 更新
    * */
    @PutMapping("/girls/{id}")
    public Girl girlUpd(@PathVariable("id") Integer id,@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        girl.setId(id);
        return girlRepository.save(girl);
    }
    /*
    * 删除
    * */
    @DeleteMapping("girls/{id}")
    public void girlDel(@PathVariable("id") Integer id){
         girlRepository.deleteById(id);
    }
    /*
    * 通过年龄查询
    * */
    @GetMapping("/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @PostMapping("/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }
}
