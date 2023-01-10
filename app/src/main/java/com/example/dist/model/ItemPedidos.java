package com.example.dist.model;

public class ItemPedidos {

        private String procesosPedido;
        private String codigoPedido;
        private String fkDatosEntrega;
        private String fkClientes;
        private String estadoPedido;
        private String comprobante;

        public ItemPedidos(String procesosPedido, String codigoPedido, String fkDatosEntrega, String fkClientes, String estadoPedido, String comprobante) {
            this.procesosPedido = procesosPedido;
            this.codigoPedido = codigoPedido;
            this.fkDatosEntrega = fkDatosEntrega;
            this.fkClientes = fkClientes;
            this.estadoPedido = estadoPedido;
            this.comprobante = comprobante;
        }

        public String getProcesosPedido() {
            return procesosPedido;
        }

        public void setProcesoPedido(String procesosPedido) {
            this.procesosPedido = procesosPedido;
        }

        public String getCodigoPedido() {
            return codigoPedido;
        }

        public void setCodigoPedido(String codigoPedido) {
            this.codigoPedido = codigoPedido;
        }

        public String getFkDatosEntrega() {
            return fkDatosEntrega;
        }

        public void setFkDatosEntrega(String fkDatosEntrega) {
            this.fkDatosEntrega = fkDatosEntrega;
        }

        public String getFkClientes() {
            return fkClientes;
        }

        public void setFkClientes(String fkClientes) {
            this.fkClientes = fkClientes;
        }

        public String getEstadoPedido() {
            return estadoPedido;
        }

        public void setEstadoPedido(String estadoPedido) {
            this.estadoPedido = estadoPedido;
        }

        public String getComprobante() {
            return comprobante;
        }

        public void setComprobante(String comprobante) {
            this.comprobante = comprobante;
        }


    }


