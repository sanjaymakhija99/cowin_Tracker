package com.crazyengg.umcvaxtracker.pojo;

import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class VaxCenters{
    public List<Center> centers;
}
