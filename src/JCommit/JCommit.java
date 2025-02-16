package JCommit;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Data // instead of all of them?
@AllArgsConstructor
public class JCommit {
    public int commits = 4;

    public void print() {
        System.out.println("What's the difference?");
        System.out.println("Java " + (12 + 9));
        System.out.println(commits + " commits");
    }
}
