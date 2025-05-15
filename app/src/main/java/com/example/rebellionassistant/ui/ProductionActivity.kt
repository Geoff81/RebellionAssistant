package com.example.rebellionassistant.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rebellionassistant.ui.theme.RebellionAssistantTheme
import com.example.rebellionassistant.viewmodel.ProductionViewModel

class ProductionActivity : ComponentActivity() {
    private val productionViewModel: ProductionViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RebellionAssistantTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ProductionScreen(productionViewModel)
                }
            }
        }
    }
}

@Composable
fun ProductionScreen(viewModel: ProductionViewModel) {
    val systems = viewModel.systemsWithProduction

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Production des Systèmes", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(8.dp))

        ProductionListAdapter(systems = systems)
    }
}
