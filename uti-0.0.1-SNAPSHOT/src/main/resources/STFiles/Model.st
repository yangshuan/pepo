
public class $classname$ extends AbstractModelVariable{

  public static final String SEGMENT = "session_segment";
  public static final String SCORE = "session_score";
  public static final String CONTROL_GROUP = "control_group";
  public static final Double DEFAULT_SCORE = Double.valueOf(-999);
  public static final int MOD_RANGE = 1000;

  @Override
  protected Double calculate(Map<String, Object> context) throws Exception {

    try {
      $abstractsegment$ segment = new $segmentlogic$()
          .getSegment(context);
      Double score = segment.calculateScore(context);
      context.put(CONTROL_GROUP, true);
      context.put(SEGMENT, segment.getSegmentType().getId());
      context.put(SCORE, score);
      return score;
    } catch (Exception e) {
      context.put(SEGMENT, -1);
      context.put(SCORE, DEFAULT_SCORE);
      context.put(CONTROL_GROUP, true);
      return DEFAULT_SCORE;
    }

  }

  protected String getModelName() {
    return this.getName();
  }
  
}
