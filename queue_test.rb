def priority(arr)
  temp = []
  for i in 0..arr.length-1
    for j in 0..arr.length-2
      if arr[j][2] > arr[j+1][2]
        temp = arr[j]
        arr[j] = arr[j+1]
        arr[j+1] = temp
      end
    end
  end
  return arr
end

class Queue_test
  queue =[]
  ar =[]
  n = gets.to_i

  for i in 0...n do
    input = gets.chomp
    ar = input.split
    if ar[0] == "QUEUE"
      queue << ar
      queue = priority(queue)
    elsif input == "DEQUEUE" && queue.length != 0
      queue.pop
    else
      puts "error"
      break
    end
  end

  if queue.length == 0
    puts "empty"
  else
    puts queue[queue.length/2][1]
  end

  print queue


end