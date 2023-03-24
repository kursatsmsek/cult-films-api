package com.kursatdev.cultfilms.controller;

import com.kursatdev.cultfilms.model.Category;
import com.kursatdev.cultfilms.model.Movie;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cult-movies")
public class CultMoviesController {

    @GetMapping
    public List<Movie> getAllCultMovies() {
        return Arrays.asList(
                new Movie("Fight Club",
                        "Fight Club is a 1999 film about an insomniac narrator who becomes involved in a secret organization called fight club with his charismatic friend Tyler Durden. The film explores themes of masculinity, consumerism, mental illness, and identity, culminating in a shocking finale. Starring Brad Pitt, Edward Norton, and Helena Bonham Carter, the film received critical acclaim for its provocative themes and innovative cinematography.",
                        Category.DRAMA,
                        "https://wallpaper.dog/large/20573745.jpg"),
                new Movie("The Godfather",
                        "The Godfather is a 1972 American crime film directed by Francis Ford Coppola, based on the novel by Mario Puzo. Starring Marlon Brando, Al Pacino, and James Caan, the film tells the story of the Corleone family, a powerful Mafia clan in New York City. The film explores themes of family, loyalty, power, and violence as the Corleones navigate their way through the world of organized crime. Widely regarded as one of the greatest films in cinema history, The Godfather won three Academy Awards and spawned two sequels.",
                        Category.CRIME,
                        "https://wallpaperaccess.com/full/1107716.jpg"),
                new Movie("Forrest Gump",
                        "Forrest Gump is a 1994 American film directed by Robert Zemeckis, based on the novel of the same name by Winston Groom. The movie follows the life of Forrest Gump, a simple man with a low IQ, who unwittingly becomes a part of some of the most significant historical events in America's recent past. The film stars Tom Hanks in the lead role and also features Robin Wright, Gary Sinise, and Sally Field in supporting roles. The film won six Academy Awards, including Best Picture, Best Director, and Best Actor for Tom Hanks.",
                        Category.DRAMA,
                        "https://cdn.wallpapersafari.com/86/1/h207Bk.jpg"),
                new Movie("The Matrix",
                        "The Matrix is a 1999 sci-fi film about a dystopian future where humans are trapped inside a simulated reality created by machines, and a computer programmer named Thomas Anderson (Keanu Reeves) joins a resistance group to fight against them. The film won four Academy Awards and led to two sequels and a fourth installment released in 2021.",
                        Category.ACTION,
                        "https://wallpaperaccess.com/full/2854028.jpg"),
                new Movie("Schindler's List",
                        "Schindler's List is a 1993 American historical drama film directed and co-produced by Steven Spielberg. The movie is based on the true story of Oskar Schindler (Liam Neeson), a German industrialist who saved more than a thousand Jewish refugees during the Holocaust by employing them in his factories. The film stars Ben Kingsley and Ralph Fiennes in supporting roles. Schindler's List received critical acclaim and won seven Academy Awards, including Best Picture, Best Director, and Best Adapted Screenplay. It is widely regarded as one of the greatest films ever made.",
                        Category.DRAMA,
                        "https://images4.alphacoders.com/700/700413.jpg")
        );
    }
}
