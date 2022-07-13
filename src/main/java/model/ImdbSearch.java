package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class ImdbSearch {
        private List<Search> Search = new ArrayList<Search>();
        private String TotalResults;
        private String Response;
}
