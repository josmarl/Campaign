/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.org.ca.sms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pe.org.ca.sms.domain.DatosPersonales;

/**
 *
 * @author josmarl
 */
@Mapper
public interface DatosPersonalesMapper {

    @Select("SELECT id_personal,nombre,apepat,apemat,sexo,nacfec,fono1,fono2 FROM JOSMARL.datos_personales")
    List<DatosPersonales> findDatosPersonaleses();
}
