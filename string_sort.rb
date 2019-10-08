class StringSort
  sortThis = Array.new
  temp = Array.new
  limit = gets.to_i
  for i in 0...limit
    input = gets.chomp
    sortThis << input
  end
  sorted = sortThis.sort_by(&:length)
  print sorted
  puts
  for j in 0...100
    temp.clear
    for k in 0...limit
      if sorted[k].size == j
        temp << sorted[k]
      end
    end
    temp = temp.sort
    for l in 0...temp.length
      print temp[l]+" "
    end
  end
end

