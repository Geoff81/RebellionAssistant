package com.example.rebellionassistant.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rebellionassistant.model.SystemWithProduction

@Composable
fun ProductionListAdapter(systems: List<SystemWithProduction>) {
    Column {
        systems.forEach { systemWithProduction ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                colors = CardDefaults.cardColors()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Nom : ${systemWithProduction.system.name}", style = MaterialTheme.typography.bodyLarge)
                    Text(text = "Secteur : ${systemWithProduction.system.sector}", style = MaterialTheme.typography.bodyMedium)
                    Text(text = "Production : ${systemWithProduction.production.joinToString { it.unit }}", style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}
