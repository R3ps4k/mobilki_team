package com.example.parkingipwr.mock

import com.example.parkingipwr.data.Parking
import com.google.android.gms.maps.model.LatLng

object ParkingBase{

    private val base = ArrayList<ParkingInfo>()
    init {
        base.add(
            ParkingInfo(
                Parking.WRO.value,
                "WRO",
                LatLng(51.108964, 17.055564),
                207
            )
        )
        base.add(
            ParkingInfo(
                Parking.C13.value,
                "C-13",
                LatLng(51.107393, 17.058468),
                54
            )
        )
        base.add(
            ParkingInfo(
                Parking.D20.value,
                "D-20",
                LatLng(51.1100504, 17.0596779),
                76
            )
        )
    }


    fun getParkingsArray() : ArrayList<ParkingInfo>{
        return base
    }

    fun getParkingFromID(id: Int) : ParkingInfo? {
        for(i in base){
            if(i.id == id)
                return i
        }
        return null
    }
}