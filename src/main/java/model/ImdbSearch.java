package model;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class ImdbSearch {
        @SerializedName("Search")
        private List<Search> search = new ArrayList<Search>();
        @SerializedName("TotalResults")
        private String totalResults;
        @SerializedName("Response")
        private String response;
}
