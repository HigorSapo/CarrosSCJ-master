package com.example.logonpf.carros.model

/**
 * Created by logonrm on 10/03/2018.
 */

data class Carro(val id: String?,
                 var marca: String,
                 var modela: String,
                 var ano: Int,
                 var placa: String,
                 var urlImagem: String?) {
    /*constructor(): this("", "", "", 0, "")*/
}