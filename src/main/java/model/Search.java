package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Search {
        private String Title;
        private String Year;
        private String imdbID;
        private String Type;
        private String Poster;

}
