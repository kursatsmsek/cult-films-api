package com.kursatdev.cultfilms.controller;

import com.kursatdev.cultfilms.model.Category;
import com.kursatdev.cultfilms.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/developer-advices")
public class DeveloperAdviceMoviesController {
    @GetMapping
    public List<Movie> getAllAdvicedMovies() {
        return Arrays.asList(
                new Movie("Inception",
                        "Inception is a 2010 science fiction action film directed by Christopher Nolan. The movie follows a skilled thief, Cobb, who is tasked with implanting an idea into the mind of a wealthy businessman. To accomplish this, Cobb and his team enter the businessman's dreams and navigate through layers of subconsciousness to plant the idea. As they go deeper into the dream, the lines between reality and fantasy begin to blur, and the team must fight to complete their mission and return to the real world.",
                        Category.ADVENTURE,
                        "https://images2.alphacoders.com/851/thumb-1920-85182.jpg"),
                new Movie("Truman Show",
                        "The Truman Show is a 1998 satirical comedy-drama film directed by Peter Weir. The movie follows Truman Burbank, a man who has unknowingly been living his entire life as the star of a 24/7 reality TV show. As he begins to realize that his life is a carefully crafted fabrication, he sets out to uncover the truth and escape the confines of his manufactured world. The film explores themes of free will, reality vs. perception, and the power of media in shaping our lives.",
                        Category.COMEDY,
                        "https://images8.alphacoders.com/485/485296.jpg"),
                new Movie("Who am I",
                        "Who Am I is a 2014 German techno-thriller film directed by Baran bo Odar. The movie follows Benjamin, a young hacker who becomes involved with a group of hacktivists known as CLAY, who are working to expose corruption and wrongdoing in the world of finance. As Benjamin's involvement with the group deepens, he becomes increasingly paranoid and begins to question his own identity. The film explores themes of identity, trust, and the blurred lines between the real and virtual worlds.",
                        Category.ACTION,
                        "https://images3.alphacoders.com/831/thumb-1920-831892.jpg"),
                new Movie("The Internship",
                        "The Internship is a 2013 comedy film directed by Shawn Levy. The movie follows Billy and Nick, two middle-aged salesmen who lose their jobs and decide to apply for an internship at Google. Despite their lack of technical skills, they manage to secure positions on a team of misfits and compete against other interns in a series of challenges. Along the way, they learn about teamwork, perseverance, and the value of diverse perspectives. The film features comedic performances from Vince Vaughn, Owen Wilson, and an ensemble cast of rising stars.",
                        Category.ADVENTURE,
                        "https://wallpapercave.com/wp/wp8433743.jpg"),
                new Movie("V for Vendetta",
                        "V for Vendetta is a 2006 dystopian thriller film directed by James McTeigue. The movie is set in a totalitarian society in a futuristic England, where a masked vigilante known as V seeks to overthrow the corrupt government and inspire a revolution. V allies with a young woman named Evey Hammond, and together they embark on a campaign of violence and subterfuge against the oppressive regime. The film explores themes of political corruption, individualism, and the struggle for freedom in the face of oppression. It is known for its iconic Guy Fawkes mask and memorable dialogue, including the line \"Remember, remember the fifth of November.\"",
                        Category.CRIME,
                        "https://images4.alphacoders.com/634/thumb-1920-63444.jpg")
        );
    }
}
