package ir.maktabsharif.Model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Book {

    private Long id;
    private String title;
    private String author;
    private Integer publicationYear;
}
