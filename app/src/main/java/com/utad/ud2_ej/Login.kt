package com.utad.ud2_ej

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputLayout

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Login : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
    val args: LoginArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var loginEmail = view.findViewById<EditText>(R.id.id_email)
        var loginPassword = view.findViewById<EditText>(R.id.id_password)
        val argOrigenRegistro = args.origenRegistro
        val argEmail =args.email

    if (argOrigenRegistro){
        loginEmail.setText(argEmail)
    }



        view?.findViewById<Button>(R.id.btn_Login)?.setOnClickListener {
            val action = LoginDirections.actionLoginToHomeFragment2(
                loginEmail.text.toString()
            )
            var emailValido =false;
            var passwordValido =false;

            if (Validator.isEmailValid(loginEmail.text.toString())) {
                emailValido=true
            }
            else {
                Toast.makeText(context, "Email no válido",Toast.LENGTH_LONG).show()
            }
            if (loginPassword.text.toString().length>=4){
                passwordValido = true
            }
            else {
                Toast.makeText(context, "Contraseña demasiado corta",Toast.LENGTH_LONG).show()
            }
            if (emailValido && passwordValido) {
                Toast.makeText(context, "Login válido",Toast.LENGTH_LONG).show()
                //findNavController().navigate(R.id.action_login_to_homeFragment2)
                findNavController().navigate(action)
            }
        }
    }
}