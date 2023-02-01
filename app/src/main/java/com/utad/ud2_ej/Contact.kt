package com.utad.ud2_ej

import java.lang.Boolean.FALSE
import java.lang.Boolean.TRUE


class Contact(val img: Int, val name: String, val email: String, val isOnline: Boolean) {

    companion object {
        private var lastContactId = 0
        fun createContactsList(numContacts: Int): ArrayList<Contact> {
            val contacts = ArrayList<Contact>()

            contacts.add(Contact(R.drawable.avatar_13140ac259a867eb11595ec0308fa0c1,"Javier Cereceda", "javier.ce@gmail.com", TRUE))
            contacts.add(Contact(R.drawable.avatar_05d43d26540bf71f2d5ec4ebfa1e45f6,"Elisa Balaguer", "elisa.ba@gmail.com", TRUE))
            contacts.add(Contact(R.drawable.avatar_1aa840d8beb1a997399e5f752fecbe74,"Antonio Salas", "antonio.sa@gmail.com", TRUE))
            contacts.add(Contact(R.drawable.avatar_49602e486edf29bafaa1c4733cf0a987,"Yan Plaza", "yan.plaza@gmail.com", TRUE))
            contacts.add(Contact(R.drawable.avatar_4a3d8458961911104a2ef0a0c8d3771f,"Oscar Rabasco", "oscar.ra@gmail.com", TRUE))
            contacts.add(Contact(R.drawable.avatar_61399ebfb1bf27ea30f5fac9c2f73eb4,"Miguel Sanchez", "miguel.sa@gmail.com", FALSE))
            contacts.add(Contact(R.drawable.avatar_76fa112f5d0024ec60d4c3acd33c2f8f,"Sonia Rios", "sonia.ri@gmail.com", TRUE))
            contacts.add(Contact(R.drawable.avatar_86004c75e9402925131c86fe48010ea1,"Pedro Sanchez", "pedro.sa@gmail.com", TRUE))
            contacts.add(Contact(R.drawable.avatar_a2bb8c0aca8f8d1af86893903499b861,"Juan Cano", "juancano@gmail.com", TRUE))

            return contacts
        }
    }
}