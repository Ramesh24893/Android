package com.example.settingrecyclerview

class Data {

    companion object{
        fun getData() : ArrayList<UICompData>{


            val data = ArrayList<UICompData>()

            val image= listOf(
                R.drawable.wifi_img,
                R.drawable.connected,
                R.drawable.apps,
                R.drawable.noti,

                R.drawable.battery,
                R.drawable.storage,

                R.drawable.sound,
                R.drawable.display,
                R.drawable.wallpaper,
                R.drawable.access,
                R.drawable.security,
                R.drawable.privacy,

                R.drawable.location,
                R.drawable.wifi_img,
                R.drawable.passwords,
                R.drawable.parental,

                R.drawable.wifi_img,
                R.drawable.system,
                R.drawable.about_emulated,

                R.drawable.tips,


                )
            val mes1=listOf("Network & Internet",
                "Connected devices",
                "Apps",
                "Notification",
                "Battery",
                "Storage",
                "Sound & vibration",
                "Display",
                "Wallpaper & style",
                "Accessibility",
                "Security",
                "Privacy",
                "Location",
                "Safety & emergency",
                "Passwords & accounts",
                "Digital Wellbeing & parental controls",
                "Google",
                "System",
                "About emulated device",
                "Tips & support"
            )
            val mes2= listOf(
                "Mobile, Wifi, hotspot",
                "Bluetooth, pairing",
                "Assistant, recent apps, default apps",
                "Notification history, conversations",
                "100%",
                "42% used - 4.67 GB free",
                "Volume, haptics, Do Not Disturb",
                "Dark theme, font size, brightness",
                "Colors,theme icons, app grid",
                "Display, interaction, audio",
                "Screen lock, Find My Device, app security",
                "Permissions, account activity, personal data",
                "On - 3 apps have access to location",
                "Emergency SOS, medical info, alerts",
                "Saved passwords, autofill, synced accounts",
                "Screen time, app timers, bedtime schedules",
                "Services & preferences",
                "Languages, gestures, time, backup",
                "sdk_gphones64_x86_64",
                "Help articles, phone & chat"




            )
            for(i in image.indices){
                val x=UICompData(image[i],mes1[i],mes2[i])
                data.add(x)
            }
            return data
        }
    }
    }
