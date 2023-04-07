package com.example.recyclerview

data class Cities(val id:Int,val text: String,val info: Int){



    companion object {
        fun getData(): ArrayList<Cities> {
            val cities : ArrayList<Cities> = ArrayList<Cities>()

//            cities.add(Cities(R.drawable.download,"0 Chennai",R.string.chennai))
//            cities.add(Cities(R.drawable.images,"1 Mumbai",R.string.mumbai))
//            cities.add(Cities(R.drawable.a,"2 Delhi",R.string.delhi))
//            cities.add(Cities(R.drawable.b,"3 Kolkata",R.string.kolkata))
//            cities.add(Cities(R.drawable.c,"4 Tuticorin",R.string.tuticorin))
//            cities.add(Cities(R.drawable.d,"5 Tirunelveli",R.string.tirunelveli))
//            cities.add(Cities(R.drawable.e,"6 Madurai",R.string.madurai))
//            cities.add(Cities(R.drawable.download,"7 Guduvancheri",R.string.madurai))
//
//
//            cities.add(Cities(R.drawable.b,"8 Goa",R.string.goa))
//            cities.add(Cities(R.drawable.download,"9 Chennai",R.string.chennai))
//            cities.add(Cities(R.drawable.images,"10 Mumbai",R.string.mumbai))
//            cities.add(Cities(R.drawable.a,"11 Delhi",R.string.delhi))
//            cities.add(Cities(R.drawable.b,"12 Kolkata",R.string.kolkata))
//            cities.add(Cities(R.drawable.c,"13 Tuticorin",R.string.tuticorin))
//            cities.add(Cities(R.drawable.d,"14 Tirunelveli",R.string.tirunelveli))
//            cities.add(Cities(R.drawable.e,"15 Madurai",R.string.madurai))
//            cities.add(Cities(R.drawable.download,"16 Guduvancheri",R.string.madurai))
//
//
//            cities.add(Cities(R.drawable.b,"17 Goa",R.string.goa))
            return cities

        }
    }

}
