package nickebbitt;

import lombok.Data;

@Data
class Language {

    private final int id;
    private final String name;
    private final String type;
    private final int yearCreated;

}
