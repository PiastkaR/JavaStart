package com.javastart.streams.soccer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FootballApp {
    public static void main(String[] args) {
        Stream<FootballMatch> matches = createStream();
        matches.sorted(
                (result1, result2) -> -Integer.compare(result1.getGoalDifference(), result2.getGoalDifference())
        ).forEach(System.out::println);

        Stream<FootballMatch> newMatches = createStream();
        List<FootballMatch> poland = getMatches(newMatches, "Poland");
        System.out.println("Polish matches: " + poland);

        Stream<FootballMatch> countTeams = createStream();
        long count = countTeams
                .distinct()
                .count();
        System.out.println("Number of distinct teams: " + count);

        Stream<FootballMatch> countGoals = createStream();
        long golasSum = countGoals
                .mapToInt(FootballMatch::getGoalSum)
                .sum();

        System.out.println("Number of all goals: " + golasSum);
    }

    private static Stream<FootballMatch> createStream() {
        return Stream.of(
                new FootballMatch("Poland", "Germany", 1, 0),
                new FootballMatch("UK", "US", 5, 6),
                new FootballMatch("France", "Paraguay", 3, 0),
                new FootballMatch("San Marino", "Costarica", 1, 0),
                new FootballMatch("Cuba", "Chile", 2, 1),
                new FootballMatch("Italy", "Germany", 1, 1),
                new FootballMatch("Brazil", "Germany", 1, 6),
                new FootballMatch("Poland", "Brazil", 2, 2),
                new FootballMatch("Poland", "Chile", 0, 0));

    }

    private static List<FootballMatch> getMatches(Stream<FootballMatch> stream, String teamName) {
        return stream
                .filter(s -> s.getGuests().equals(teamName) || s.getHosts().equals(teamName))
                .collect(Collectors.toList());
    }

}
