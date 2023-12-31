package tech.ada.bootcamp.arquitetura.cartaoservice.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request.CompraRequest;
import tech.ada.bootcamp.arquitetura.cartaoservice.services.CompraService;


@RestController
@RequestMapping("/compra")
@Slf4j
public class RealizarCompraController {
    private final CompraService compraService;
    public RealizarCompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping(path = "", produces = "application/json" )
    public ResponseEntity<String> realizarCompra(@RequestBody CompraRequest compraRequest){
        return compraService.realizarCompra(compraRequest);
    }
}
