package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double balls = 0D;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                balls += subject.score();
                count++;
            }
        }
        return balls / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double balls = 0D;
            int count = 0;
            for (Subject subject : pupil.subjects()) {
                balls += subject.score();
                count++;
            }
            list.add(new Label(pupil.name(), balls / count));
        }
        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int rslSum = map.getOrDefault(subject.name(), 0) + subject.score();
                map.put(subject.name(), rslSum);
            }
        }
        for (String name : map.keySet()) {
            rsl.add(new Label(name, map.get(name) / (double) pupils.size()));
        }
        return rsl;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double balls = 0D;
            for (Subject subject : pupil.subjects()) {
                balls += subject.score();
            }
            list.add(new Label(pupil.name(), balls));
        }
        list.sort(Comparator.naturalOrder());
        return list.get(pupils.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int rslSum = map.getOrDefault(subject.name(), 0) + subject.score();
                map.put(subject.name(), rslSum);
            }
        }
        for (String name : map.keySet()) {
            list.add(new Label(name, map.get(name)));
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }
}