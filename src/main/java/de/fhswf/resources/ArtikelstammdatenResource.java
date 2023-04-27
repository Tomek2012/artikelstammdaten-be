package de.fhswf.resources;

import de.fhswf.entities.Testobjekt;
import de.fhswf.services.TestobjektService;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/artikelstammdaten")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArtikelstammdatenResource {

    @Inject
    TestobjektService testobjektService;

    @GET
    public List<Testobjekt> list() {
        return testobjektService.list();
    }

    @POST
    @Path("/add")
    public List<Testobjekt> add(Testobjekt testobjekt) {
        testobjektService.add(testobjekt);
        return list();
    }
}