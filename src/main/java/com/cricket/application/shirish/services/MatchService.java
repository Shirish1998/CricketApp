package com.cricket.application.shirish.services;

import com.cricket.application.shirish.entity.Match;

import java.util.List;

public interface MatchService {

    List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();
    List<Match> getAllMatches();
}
