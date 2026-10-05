package com.example.gestaoestado.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun CaixaDeEntrada(
    modifier: Modifier,
    label: String,
    placeholder: String,
    keyboardType: KeyboardType,
    value: String,
    // unit é uma função sem retorno (void)
    // (String) -> Unit é uma função que recebe uma string e não retorna nada
    atualizarValor: (String) -> Unit    // Função de callback para atualizar o valor
    ) {
    OutlinedTextField(
        modifier = modifier,
        label = {
            Text(text = label)
        },
        placeholder = {
            Text(text = placeholder)
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        ),
        value = value,
        onValueChange = {
            atualizarValor(it)
        }
    )

}