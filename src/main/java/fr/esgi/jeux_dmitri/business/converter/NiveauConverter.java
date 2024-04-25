package fr.esgi.jeux_dmitri.business.converter;

import fr.esgi.jeux_dmitri.business.enumeration.ENiveau;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class NiveauConverter implements AttributeConverter<ENiveau, String> {

    @Override
    public String convertToDatabaseColumn(ENiveau niveau) {
        if (niveau == null) {
            return null;
        }
        return niveau.getNom();
    }

    @Override
    public ENiveau convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        for (ENiveau niveau : ENiveau.values()) {
            if (niveau.getNom()
                      .equals(dbData)) {
                return niveau;
            }
        }
        throw new IllegalArgumentException("Unknown database value: " + dbData);
    }
}