package movie_csv_Exercise;

import java.util.List;

public class Movie {
    private String movieID;
    private String title;
    private String koreanTitle;
    private String plot;
    private String releaseYear;
    private String runningTime;
    private String gradeID;
    private String gradeInKoreaID;
    private String poster;
    private String releaseDateInKorea;
    private String boxOfficeWWGross;
    private String boxOfficeUSGross;
    private String budget;
    private String originalAuthor;
    private String originalSource;

    // public Movie(String movieID, String title, String koreanTitle, String plot,
    // String releaseYear, String runningTime,
    // String gradeID, String gradeInKoreaID, String poster, String
    // releaseDateInKorea, String boxOfficeWWGross,
    // String boxOfficeUSGross, String budget, String originalAuthor, String
    // originalSource) {
    // this.movieID = movieID;
    // this.title = title;
    // this.koreanTitle = koreanTitle;
    // this.plot = plot;
    // this.releaseYear = releaseYear;
    // this.runningTime = runningTime;
    // this.gradeID = gradeID;
    // this.gradeInKoreaID = gradeInKoreaID;
    // this.poster = poster;
    // this.releaseDateInKorea = releaseDateInKorea;
    // this.boxOfficeWWGross = boxOfficeWWGross;
    // this.boxOfficeUSGross = boxOfficeUSGross;
    // this.budget = budget;

    // }

    public Movie(List<String> list) {
        this.movieID = list.get(Category.MOVIEID.ordinal());
        this.title = list.get(Category.TITLE.ordinal());
        this.koreanTitle = list.get(Category.KOREANTITLE.ordinal());
        this.plot = list.get(Category.PLOT.ordinal());
        this.releaseYear = list.get(Category.RELEASEYEAR.ordinal());
        this.runningTime = list.get(Category.RUNNINGTIME.ordinal());
        this.gradeID = list.get(Category.GRADEID.ordinal());
        this.gradeInKoreaID = list.get(Category.GRADEINKOREAID.ordinal());
        this.poster = list.get(Category.POSTER.ordinal());
        this.releaseDateInKorea = list.get(Category.RELEASEDATEINKOREA.ordinal());
        this.boxOfficeWWGross = list.get(Category.BOXOFFICEWWGROSS.ordinal());
        this.boxOfficeUSGross = list.get(Category.BOXOFFICEUSGROSS.ordinal());
        this.budget = list.get(Category.BUDGET.ordinal());
        if (list.get(Category.ORIGINALAUTHOR.ordinal()).equals("NULL")) {
            this.originalAuthor = "";
        } else {
            this.originalAuthor = list.get(Category.ORIGINALAUTHOR.ordinal());
        }
        if (list.get(Category.ORIGINALSOURCE.ordinal()).equals("NULL")) {
            this.originalSource = "";
        } else {
            this.originalSource = list.get(Category.ORIGINALSOURCE.ordinal());
        }
    }

    public String getCategory(Category category) {
        switch (category) {
            case TITLE:
                return title;
            case KOREANTITLE:
                return koreanTitle;
            case RELEASEYEAR:
                return releaseYear;
            case RUNNINGTIME:
                return runningTime;
            case GRADEID:
                return gradeID;
            case GRADEINKOREAID:
                return gradeInKoreaID;
            case RELEASEDATEINKOREA:
                return releaseDateInKorea;
            case BOXOFFICEWWGROSS:
                return boxOfficeWWGross;
            case BOXOFFICEUSGROSS:
                return boxOfficeUSGross;
            case BUDGET:
                return budget;
            default:
                throw new IllegalArgumentException("존재하지 않는 카테고리 입니다");
        }
    }

    public String getTitle() {
        return koreanTitle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        // sb.append("Movie Id : ").append(movieID).append("");
        sb.append("Title : ").append(title).append("").append("\n");
        sb.append("KoreanTitle : ").append(koreanTitle).append("\n");
        sb.append("Plot : ").append(plot).append("\n");
        sb.append("ReleaseYear : ").append(releaseYear).append("\n");
        sb.append("RunningTime : ").append(runningTime).append("\n");
        sb.append("GradeID : ").append(gradeID).append("\n");
        sb.append("gradeInKoreaID : ").append(gradeInKoreaID).append("\n");
        sb.append("Poster : ").append(poster).append("\n");
        sb.append("ReleaseDateInKorea : ").append(releaseDateInKorea).append("\n");
        sb.append("BoxOfficeWWGross : ").append(boxOfficeWWGross).append("\n");
        sb.append("BoxOfficeUsGross : ").append(boxOfficeUSGross).append("\n");
        sb.append("Budget : ").append(budget).append("\n");
        sb.append("OriginalAuthor : ").append(originalAuthor).append("\n");
        sb.append("OriginalSource : ").append(originalSource);
        return sb.toString();
    }
}
