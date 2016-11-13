/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.ca.sms.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.org.ca.sms.domain.DatosPersonales;
import pe.org.ca.sms.mapper.DatosPersonalesMapper;

/**
 *
 * @author josmarl
 */
@Service("datosPersonalesService")
@Transactional
public class DatosPersonalesServiceImpl implements DatosPersonalesService {

    @Autowired
    DatosPersonalesMapper datosPersonalesMapper;

    @Override
    public List<DatosPersonales> findDatosPersonaleses() {
        return datosPersonalesMapper.findDatosPersonaleses();
    }
}
