package com.backend.parcial.test;

import com.backend.parcial.dao.impl.OdontologoDaoH2;
import com.backend.parcial.entity.Odontologo;
import com.backend.parcial.service.impl.OdontologoService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OdontologoServiceTest {

    private OdontologoService odontologoService;
    @Test
    public void deberiaCrearOdontologo(){
        odontologoService = new OdontologoService(new OdontologoDaoH2());
        // Registrar un nuevo odontólogo
        Odontologo odontologo = new Odontologo("123", "Juan", "Perez");
        Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologo);

        // Verificar que el odontólogo se haya registrado correctamente
        assertFalse(odontologoRegistrado == null);
    }

    @Test
    public void testListaEntidadNoVacia() {
        OdontologoDaoH2 odontologoDao = new OdontologoDaoH2();

        // Asumiendo que ya hay odontólogos registrados en la base de datos
        List<Odontologo> odontologos = odontologoDao.listaEntidad();

        assertFalse(odontologos.isEmpty(), "La lista no deberia estar vacia");
    }
}