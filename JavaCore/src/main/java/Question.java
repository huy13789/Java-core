import java.time.LocalDate;

public class Question {
    private int questionId;
    private String content;
    private CategoryQuestion categoryId;
    private int typeId;
    private Account createID; //Id của người tạo câu hỏi
    private LocalDate creteDate;
}
