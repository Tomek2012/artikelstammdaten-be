package de.fhswf.services;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.fhswf.entities.Testobjekt;
import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

@ApplicationScoped
public class TestobjektService {

    @Inject
    MongoClient mongoClient;

    public List<Testobjekt> list() {
        List<Testobjekt> list = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                Testobjekt testobjekt = new Testobjekt();
                testobjekt.setName(document.getString("name"));
                testobjekt.setDescription(document.getString("description"));
                list.add(testobjekt);
            }
        } finally {
            cursor.close();
        }
        return list;
    }

    public void add(Testobjekt testobjekt) {
        Document document = new Document()
                .append("name", testobjekt.getName())
                .append("description", testobjekt.getDescription());
        getCollection().insertOne(document);
    }

    private MongoCollection getCollection() {
        return mongoClient.getDatabase("testobjekt").getCollection("testobjekt");
    }
}
