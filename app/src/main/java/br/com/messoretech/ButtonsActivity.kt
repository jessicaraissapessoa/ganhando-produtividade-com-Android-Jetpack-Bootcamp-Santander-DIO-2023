package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityButtonsBinding

class ButtonsActivity : AppCompatActivity() {

    private val binding by lazy { ActivityButtonsBinding.inflate(layoutInflater) } //Variável global para o binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
    }

    companion object {
        //Companion object para a nossa ButtonsActivity para que a gente consiga permitir criar o método createIntent
        fun createIntent(context: Context): Intent = Intent(context, ButtonsActivity::class.java) //Inline function que retorna uma Intent
    }

}
