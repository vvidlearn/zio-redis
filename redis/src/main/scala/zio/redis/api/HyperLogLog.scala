package zio.redis.api

import zio.redis.RedisCommand
import zio.redis.Input._
import zio.redis.Output._

trait HyperLogLog {
  final val pfAdd   = RedisCommand("PFADD", Tuple2(StringInput, NonEmptyList(StringInput)), BoolOutput)
  final val pfCount = RedisCommand("PFCOUNT", NonEmptyList(StringInput), LongOutput)
  final val pfMerge = RedisCommand("PFMERGE", Tuple2(StringInput, NonEmptyList(StringInput)), UnitOutput)
}
