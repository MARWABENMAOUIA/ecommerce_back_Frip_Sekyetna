package com.ecommerce.projet.Beans;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
public class CommandeRq {
    private Long idProduit;



    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public CommandeRq( Long idProduit) {
        this.idProduit = idProduit;
    }

}
