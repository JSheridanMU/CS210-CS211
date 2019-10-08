class Stacks_test
  stack =[]
  ar =[]
  n = gets.to_i

  for i in 0...n do
    input = gets.chomp
    if input != "POP"
      ar = input.split
      x = ar[1]
      y = x.to_i
      stack << y
    elsif input == "POP" && stack.length != 0
      stack.pop
    end
  end

  store = -10000
  while stack.length != 0
    check = stack.pop
    if check > store
      store = check
    end
  end
  puts store


end