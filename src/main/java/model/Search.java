package model;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Search {
        @SerializedName("Title")
        private String title;
        @SerializedName("Year")
        private String year;
        @SerializedName("imdbID")
        private String imdbID;
        @SerializedName("Type")
        private String type;
        @SerializedName("Poster")
        private String poster;

}
