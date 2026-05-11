// 이 파일 뭐 하는 파일이 어쩌구
// 수정 이력 :
//           v001 cC25807 park PT-00234 이 작업 위한 거임
//           v002 cC25807 park PT-00234 이 작업 위한 거임
//           v003 cC25807 park PT-00234 이 작업 위한 거임
//           v004 cC25807 park PT-00234 이 작업 위한 거임
//           v005 cC25807 park PT-00234 이 작업 위한 거임

package com.msa4java.edu.enumeration;

public enum Week {
    // private Week MONDAY = new Week("월요일");
    // ~ 일요일
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일"),
    SUNDAY("일요일");
    
    private final String krDay;
    
    private Week(String Day) {
        this.krDay = Day;
    }
}

class ExDays {
    public final static ExDays MONDAY = new ExDays();
    public final static ExDays TUESDAY = new ExDays();
    public final static ExDays WEDNESDAY = new ExDays();
}