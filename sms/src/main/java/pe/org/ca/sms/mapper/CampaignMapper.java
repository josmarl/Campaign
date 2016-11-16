package pe.org.ca.sms.mapper;

import pe.org.ca.sms.domain.Campaign;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author itecs
 */
@Mapper
public interface CampaignMapper {

    @Select("SELECT * FROM JOSMARL.campaign")
    List<Campaign> findCampaigns();

    @Delete("DELETE FROM JOSMARL.campaign where id = #{id}")
    void removeCampaign(@Param("id") Long id);

    @Update(
            "update JOSMARL.campaign "
            + "set nombre=#{contact.firstName}, "
            + "descripcion=#{contact.lastName}, "
            + "estado=#{contact.phone} "
            + "where id =#{campaign.id}"
    )
    void updateCampaign(@Param("campaign") Campaign campaign);

    @Select("SELECT * FROM JOSMARL.campaign where id = #{id}")
    Campaign findCampaignById(@Param("id") Long id);
}
