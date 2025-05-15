package com.example.rebellionassistant.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rebellionassistant.data.SystemEntity

@Composable
fun SystemListAdapter(systems: List<SystemEntity>) {
    Column {
        systems.forEach { system ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                colors = CardDefaults.cardColors()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Nom : ${system.name}", style = MaterialTheme.typography.bodyLarge)
                    Text(text = "Secteur : ${system.sector}", style = MaterialTheme.typography.bodyMedium)
                    Text(text = "Loyaliste : ${system.loyalty}", style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}
