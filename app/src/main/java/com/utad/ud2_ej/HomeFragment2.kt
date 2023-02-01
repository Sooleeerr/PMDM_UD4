package com.utad.ud2_ej

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HomeFragment2 : Fragment() {

    private var param1: String? = null
    private var param2: String? = null
    lateinit var contacts: ArrayList<Contact>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home2, container, false)
    }

    val args: HomeFragment2Args by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //val argOrigenLogin= args.origenLogin
        val  argEmail=args.email
        /*val argPassword=args.password
        val argNombre=args.nombre
        val argApellidos=args.apellidos
        val argFechaNac=args.fechaNacimiento*/

        val rvContacts = view.findViewById<View>(R.id.rvContacts) as RecyclerView
        // Initialize contacts
        contacts = Contact.createContactsList(20)
        // Create adapter passing in the sample user data
        val adapter = ContactsAdapter(contacts)
        // Attach the adapter to the recyclerview to populate items
        rvContacts.adapter = adapter
        // Set layout manager to position the items
        rvContacts.layoutManager = LinearLayoutManager(this.context)
        view.findViewById<TextView>(R.id.id_text_email).text = argEmail
        /*if (argOrigenLogin){
            view.findViewById<TextView>(R.id.id_text_email).text = argEmail


        } else {
            view.findViewById<TextView>(R.id.id_text_email).text = argEmail

        }*/


    }

}

