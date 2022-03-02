package mx.edu.ittepic.ladm_u1_practica2_aaronalejandrorivasluna_almacenamientodearchivosplanos

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mx.edu.ittepic.ladm_u1_practica2_aaronalejandrorivasluna_almacenamientodearchivosplanos.databinding.ActivityMainBinding
import mx.edu.ittepic.ladm_u1_practica2_aaronalejandrorivasluna_almacenamientodearchivosplanos.ui.CustomAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        //val adapter = CustomAdapter()

        //recyclerView.layoutManager= LinearLayoutManager(this)
        //recyclerView.adapter=adapter

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}