package de.fhswf.entities;

import de.fhswf.entities.objects.*;

import java.util.Date;

public class Artikelstamm {
    private ProductName[] productname;

    private long articleId;

    private long ean;

    private long articleGroup;

    private DisplayName[] displayNames;

    private Size[] sizes;

    private String gender;

    private String color;

    private String unit;

    private Description[] descriptions;

    private MaterialInformation[] materialInformations;

    private Date availableFrom;

    private Date availableUntil;

    private String countryOrigin;

    private String costPrice;

    private String msrp;

    private String currency;

    private String photoURL;

    private String photoURLMini;

    private PackingDimensions packingDimensions;
}