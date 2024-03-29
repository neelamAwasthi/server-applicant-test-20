package com.mytaxi.controller.mapper;

import com.mytaxi.datatransferobject.DriverCarDTO;
import com.mytaxi.datatransferobject.DriverDTO;
import com.mytaxi.domainobject.DriverCarDO;
import com.mytaxi.domainobject.DriverDO;
import com.mytaxi.domainvalue.GeoCoordinate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DriverCarMapper
{
    public static DriverCarDO makeDriverCarDO(DriverCarDTO driverCarDTO)
    {
        return new DriverCarDO(driverCarDTO.getCarId(), driverCarDTO.getDriverId());
    }


//    public static DriverDTO makeDriverDTO(DriverDO driverDO)
//    {
//        DriverDTO.DriverDTOBuilder driverDTOBuilder = DriverDTO.newBuilder()
//            .setId(driverDO.getId())
//            .setPassword(driverDO.getPassword())
//            .setUsername(driverDO.getUsername());
//
//        GeoCoordinate coordinate = driverDO.getCoordinate();
//        if (coordinate != null)
//        {
//            driverDTOBuilder.setCoordinate(coordinate);
//        }
//
//        return driverDTOBuilder.createDriverDTO();
//    }
//
//
//    public static List<DriverDTO> makeDriverDTOList(Collection<DriverDO> drivers)
//    {
//        return drivers.stream()
//            .map(DriverCarMapper::makeDriverDTO)
//            .collect(Collectors.toList());
//    }
}
