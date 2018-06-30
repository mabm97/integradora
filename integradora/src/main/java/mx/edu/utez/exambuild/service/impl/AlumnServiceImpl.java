package mx.edu.utez.exambuild.service.impl;

import java.util.List;
import mx.edu.utez.exambuild.entity.Alumn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.utez.exambuild.respository.AlumnRepository;
import mx.edu.utez.exambuild.service.AlumnService;

@Service
@Transactional
public class AlumnServiceImpl implements AlumnService {

    @Autowired
    private AlumnRepository alumnRepository;

    @Override
    public Alumn saveOrUpdate(Alumn alumn) {
        return alumnRepository.save(alumn);
    }

    @Override
    public List<Alumn> findAllAlumn() {
        return alumnRepository.findAll();
    }

    @Override
    public Alumn findAlumnById(Integer id) {
        return alumnRepository.findAlumnById(id);
    }

    @Override
    public void delete(Integer id) {
        Alumn alumn = new Alumn();
        alumn.setId(id);
        alumnRepository.delete(alumn);
    }

}
