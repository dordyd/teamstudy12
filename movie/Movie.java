package movie;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Movie {
    private String ID, releaseYear, runningTime,
            boxOfficeWWGross, boxOfficeUSGross, budget,
            title, koreanTitle, plot, poster, author, originalSource,
            gradeID, gradeKoreanID, releaseDateInKorea;

    public Movie(MovieBuilder movieBuilder){
        this.ID = movieBuilder.ID;
        this.releaseYear = movieBuilder.releaseYear;
        this.title = movieBuilder.title;
        this.koreanTitle = movieBuilder.koreanTitle;
        this.runningTime = runningTime;
        this.boxOfficeWWGross = boxOfficeWWGross;
        this.boxOfficeUSGross = boxOfficeUSGross;
        this.budget = budget;
        this.plot = plot;
        this.poster = poster;
        this.author = author;
        this.originalSource = originalSource;
        this.gradeID = gradeID;
        this.gradeKoreanID = gradeKoreanID;
        this.releaseDateInKorea = releaseDateInKorea;
    }

    public String getID() {
        return ID;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "ID= " + ID +
                ", title= " + title +
                ", koreanTitle= " + koreanTitle + "\'"+
                ", releaseYear= " + releaseYear + "\'\n";
    }


    public static class MovieBuilder{
        private String ID, releaseYear, runningTime,
                boxOfficeWWGross, boxOfficeUSGross, budget,
                title, koreanTitle, plot, poster, author, originalSource,
                gradeID, gradeKoreanID, releaseDateInKorea;

        public MovieBuilder(String ID, String releaseYear, String title, String koreanTitle) {
            this.ID = ID;
            this.releaseYear = releaseYear;
            this.title = title;
            this.koreanTitle = koreanTitle;
        }

        public MovieBuilder setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }

        public MovieBuilder setBoxOfficeWWGross(String boxOfficeWWGross) {
            this.boxOfficeWWGross = boxOfficeWWGross;
            return this;
        }

        public MovieBuilder setBoxOfficeUSGross(String boxOfficeUSGross) {
            this.boxOfficeUSGross = boxOfficeUSGross;
            return this;
        }

        public MovieBuilder setBudget(String budget) {
            this.budget = budget;
            return this;
        }

        public MovieBuilder setPlot(String plot) {
            this.plot = plot;
            return this;
        }

        public MovieBuilder setPoster(String poster) {
            this.poster = poster;
            return this;
        }

        public MovieBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public MovieBuilder setOriginalSource(String originalSource) {
            this.originalSource = originalSource;
            return this;
        }

        public MovieBuilder setGradeID(String gradeID) {
            this.gradeID = gradeID;
            return this;
        }


        public MovieBuilder setGradeKoreanID(String gradeKoreanID) {
            this.gradeKoreanID = gradeKoreanID;
            return this;
        }

        public MovieBuilder setReleaseDateInKorea(String releaseDateInKorea) {
            this.releaseDateInKorea = releaseDateInKorea;
            return this;
        }

        public Movie build(){
            return new Movie(this);
        }
    }
}
