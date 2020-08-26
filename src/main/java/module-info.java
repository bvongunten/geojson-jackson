module geojson{
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.annotation;

    exports org.geojson;
    exports org.geojson.jackson;
}