package com.PortfolioProject.ERPFullstackApp.ProductCard.Entities.ProductPrices;

import com.PortfolioProject.ERPFullstackApp.ProductCard.Abstract.PriceInterface;

import java.util.ArrayList;


public class ListOfPrices {

    private final ArrayList<PriceInterface> listOfPrices = new ArrayList<>();

    public ListOfPrices() {

    }

    public ArrayList<PriceInterface> getListOfPrices() {
        return listOfPrices;
    }

    public void addToListOfPrices(PriceInterface price) {
        listOfPrices.add(price);
    }
}
